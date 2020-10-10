package com.demo.rpc.serialization;

import java.io.IOException;

/**
 * @ClassName:
 * @author:
 * @Description:
 * @Date
 **/
public interface Serialization {
    <T> byte[] serialize(T obj) throws IOException;

    <T> T deserialize(byte[] data, Class<T> clazz) throws IOException;
}
