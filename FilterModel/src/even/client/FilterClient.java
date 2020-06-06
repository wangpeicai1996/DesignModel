package even.client;

import even.filter.FilterChain;
import even.filter.KeyWordFilter;
import even.filter.OtherFilter;
import even.filter.SymbolFilter;
import even.object.Message;

public class FilterClient {

    public static void main(String[] args) {
        KeyWordFilter keyWordFilter = new KeyWordFilter();
        SymbolFilter symbolFilter = new SymbolFilter();
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(keyWordFilter).addFilter(symbolFilter);
        Message message = new Message("MMP@com");
        //第二根链条，直接和第一根链条连接，都会调用doFilter方法，让两根链条中的filter都调用
        FilterChain chain2 = new FilterChain();
        chain2.addFilter(new OtherFilter());
        filterChain.addFilter(chain2);

        filterChain.doFilter(message);
        System.out.println(message.getMessage());
    }

}
