package even.filter;

import even.object.Message;

/**
 * 过滤器接口
 */
public interface Filter {

    boolean doFilter(Message msg);

}
