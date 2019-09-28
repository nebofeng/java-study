package reflection.typedemo;

import java.lang.reflect.ParameterizedType;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2019/9/25
 * @ des :
 */
public  abstract  class BaseDaoImpl<T> implements BaseDao<T> {


    private Class clazz;

    public BaseDaoImpl(){
        //获取父类
        ParameterizedType type= (ParameterizedType)this.getClass().getGenericSuperclass();
        //获取参数，即泛型参数T 的类型
        clazz=(Class)type.getActualTypeArguments()[0];
    }


}
