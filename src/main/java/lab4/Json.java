package lab4;

/**
 * Created by pin4m on 19.11.2020.
 */

import java.io.IOException;

interface Json {
    Object getFromJson(String path, Object castTo) throws IOException;
    void convertToJson(String path) throws IOException;
    void setSerializable(Object serializable);
}
