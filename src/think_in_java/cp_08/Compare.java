
package think_in_java.cp_08;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年1月11日 下午11:53:56
* 类说明
*/
//: Compare.java
//Interface for sorting callback:
interface Compare
{
boolean lessThan(Object lhs, Object rhs);
boolean lessThanOrEqual(Object lhs, Object rhs);
} //