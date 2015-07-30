package kz.homeAppliances.appliances.devicesProperties;

import kz.homeAppliances.appliances.devices.type.TypeDevices;
import kz.homeAppliances.appliances.exceptions.LoadPropFromFileException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Подгружаем мощность приборов из файла.
 *
 */
public class DevProperties {
    private static Map<TypeDevices, Integer> priceFromFile = new HashMap<>();

    private void loadProperties() throws LoadPropFromFileException {
        try {
            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream("devices.txt");
            properties.load(fis);
            priceFromFile.put(TypeDevices.COMPUTER, Integer.valueOf(properties.getProperty(TypeDevices.COMPUTER.name())));
            priceFromFile.put(TypeDevices.COOKER, Integer.valueOf(properties.getProperty(TypeDevices.COOKER.name())));
            priceFromFile.put(TypeDevices.KETTLE, Integer.valueOf(properties.getProperty(TypeDevices.KETTLE.name())));
            priceFromFile.put(TypeDevices.LAMP, Integer.valueOf(properties.getProperty(TypeDevices.LAMP.name())));
            priceFromFile.put(TypeDevices.TV, Integer.valueOf(properties.getProperty(TypeDevices.TV.name())));
        } catch (IOException e) {
            throw new LoadPropFromFileException("Error with loading file");
        }
    }

    public DevProperties() throws LoadPropFromFileException {
        loadProperties();
    }

    public static Map<TypeDevices, Integer> getProperties() {
        return priceFromFile;
    }
}
