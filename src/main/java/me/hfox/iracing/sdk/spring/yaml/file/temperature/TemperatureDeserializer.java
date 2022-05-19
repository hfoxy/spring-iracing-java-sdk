package me.hfox.iracing.sdk.spring.yaml.file.temperature;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import me.hfox.iracing.sdk.spring.exception.SdkJsonProcessingException;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemperatureDeserializer extends JsonDeserializer<Temperature> {

    private static final Pattern VALUE_PATTERN = Pattern.compile("([0-9\\.-]+) ([A-Za-z]+)");

    @Override
    public Temperature deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        String fieldValue = p.getValueAsString();
        if (fieldValue == null) {
            return null;
        }

        Matcher matcher = VALUE_PATTERN.matcher(fieldValue);
        if (!matcher.matches()) {
            throw new SdkJsonProcessingException("value does not match pattern", p.getCurrentLocation());
        }

        String numValue = matcher.group(1);
        String unitValue = matcher.group(2);

        double value = Double.parseDouble(numValue);
        TemperatureUnit type = TemperatureUnit.findByShorthand(unitValue).orElseThrow(() -> new SdkJsonProcessingException("unknown unit: " + unitValue, p.getCurrentLocation()));

        return new Temperature(value, type);
    }

}
