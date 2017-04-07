package cn.mobilemd.util;


/**
 * 作用：
 * 1、保存一个线程安全的DatabaseType容器
 * 作用：构建一个DatabaseType容器，并提供了向其中设置和获取DatabaseType的方法
 */
public class DatabaseContextHolder {
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static DatabaseType getDatabaseType(){
        return contextHolder.get();
    }

    public static void setDatabaseType(DatabaseType type) {
        contextHolder.set(type);
    }
}