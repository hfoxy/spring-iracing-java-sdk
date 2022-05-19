package me.hfox.iracing.sdk.spring.yaml.file.length;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class LengthSerializer extends JsonSerializer<Length> {

    @Override
    public void serialize(Length value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeString((String) null);
        } else {
            gen.writeString(value.getValue() + " " + value.getType().getShorthand());
        }
    }

}
