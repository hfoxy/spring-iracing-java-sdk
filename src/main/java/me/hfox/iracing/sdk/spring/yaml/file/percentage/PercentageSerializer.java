package me.hfox.iracing.sdk.spring.yaml.file.percentage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class PercentageSerializer extends JsonSerializer<Percentage> {

    @Override
    public void serialize(Percentage value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeString((String) null);
        } else {
            gen.writeString(value.getValue() + " %");
        }
    }

}
