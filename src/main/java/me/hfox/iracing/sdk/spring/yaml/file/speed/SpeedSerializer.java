package me.hfox.iracing.sdk.spring.yaml.file.speed;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class SpeedSerializer extends JsonSerializer<Speed> {

    @Override
    public void serialize(Speed value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeString((String) null);
        } else {
            gen.writeString(value.getValue() + " " + value.getType().getShorthand());
        }
    }

}
