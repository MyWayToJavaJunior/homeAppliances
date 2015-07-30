package kz.homeAppliances.appliances.devices;

import kz.homeAppliances.appliances.devices.type.TypeDevices;
import kz.homeAppliances.appliances.devicesProperties.DevProperties;

/**
 * Описание прибора.
 *
 */
public class Device implements IDevice {
    private final TypeDevices typeOfDevice;
    private final int powerOfDevice;
    private boolean stateOfDevice;

    public Device(TypeDevices typeOfDevice, boolean stateOfDevice) {
        this.typeOfDevice = typeOfDevice;
        this.powerOfDevice = DevProperties.getProperties().get(typeOfDevice);
        this.stateOfDevice = stateOfDevice;
    }

    @Override
    public boolean isOn() {
        return stateOfDevice;
    }

    @Override
    public int getPower() {
        return powerOfDevice;
    }

    /**
     * Возвращает строку с описанием
     * прибора.
     *
     * @return строка с описанием прибора
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(typeOfDevice)
                .append(" : ").append(powerOfDevice).append(" : ")
                .append(this.isOn()? "on" : "off").append(")");
        return sb.toString();
    }
}
