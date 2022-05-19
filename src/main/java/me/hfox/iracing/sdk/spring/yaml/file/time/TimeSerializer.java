package me.hfox.iracing.sdk.spring.yaml.file.time;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class TimeSerializer extends JsonSerializer<Time> {

    @Override
    public void serialize(Time value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeString((String) null);
        } else if (value.isUnlimited()) {
            gen.writeString("unlimited");
        } else {
            gen.writeString(value.getValue() + " " + value.getType().getShorthand());
        }
    }

}
