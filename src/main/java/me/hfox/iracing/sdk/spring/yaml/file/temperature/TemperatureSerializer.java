package me.hfox.iracing.sdk.spring.yaml.file.temperature;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class TemperatureSerializer extends JsonSerializer<Temperature> {

    @Override
    public void serialize(Temperature value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeString((String) null);
        } else {
            gen.writeString(value.getValue() + " " + value.getType().getShorthand());
        }
    }

}
