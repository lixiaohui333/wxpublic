package com.kxkj.wxpublic.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lxh 2014年12月22日
 * @Desc:
 */
public class GsonUtil {


    private static Gson gson;

    /**
     * @param json
     * @param clz
     * @return T
     * @author lxh
     * @Desc: TODO
     */
    public static <T> T toDomain(String json, Class<T> clz) {

        if (gson == null)
            gson = new Gson();

        T t = null;
        try {
            t = gson.fromJson(json, clz);
        } catch (Exception e) {
            return null;
        }

        return t;
    }


    /**
     * @param t
     * @return String
     * @author lxh
     * @Desc: TODO
     */
    public static <T> String toJson(T t) {
        if (gson == null)
            gson = new Gson();


        String json = gson.toJson(t);
        return json;
    }



    public static <T> List<T> toList(String json, Class clazz) {
        if (gson == null)
            gson = new Gson();

        Type type = new ParameterizedTypeImpl(clazz);
        List<T> list =  gson.fromJson(json, type);

        return list;
    }

    public static <T> Map<String, T> toMap(String json, Class<T> clz) {
        if (gson == null)
            gson = new Gson();

        Map<String, T> map = gson.fromJson(json,
                new TypeToken<Map<String, T>>() {
                }.getType());

        return map;
    }

    public static String toJson(HashMap<String, String> hashMap) {
        if (gson == null)
            gson = new Gson();

        String jsonStr = gson.toJson(hashMap);

        return jsonStr;
    }




    private static class ParameterizedTypeImpl implements ParameterizedType {
        Class clazz;

        public ParameterizedTypeImpl(Class clz) {
            clazz = clz;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[]{clazz};
        }

        @Override
        public Type getRawType() {
            return List.class;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }


}
