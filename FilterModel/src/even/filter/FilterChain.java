package even.filter;

import even.object.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * 链条实现Filter接口，可以将多条链条直接连接起来
 */
public class FilterChain implements Filter{

    private List<Filter> filterList = new ArrayList<Filter>();

    @Override
    public boolean doFilter(Message msg){
        if (filterList.size() > 0) {
            for (Filter f : filterList) {
                if (!f.doFilter(msg)){
                    return false;
                }
            }
        }
        return true;
    }

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }
}
