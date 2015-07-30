package kz.homeAppliances.appliances.devicesGenerator;

import kz.homeAppliances.appliances.devices.Device;
import kz.homeAppliances.appliances.devices.IDevice;
import kz.homeAppliances.appliances.devices.type.TypeDevices;

import java.util.ArrayList;
import java.util.Random;

/**
 * Генератор приборов.
 *
 */
public class Generate {
    private ArrayList<IDevice> devices;
    private Random random = new Random();

    /**
     * Генерирует случайным
     * образом Прибор.
     *
     * @return сгенерированный прибор
     */
    private IDevice getDevice() {
        return new Device(TypeDevices.values()
                [random.nextInt(TypeDevices.values().length)], random.nextBoolean());
    }

    /**
     * Конструктор получает пустую
     * коллекцию приборов на вход.
     *
     * @param devices пустая коллекция
     *                приборов
     */
    public Generate(ArrayList<IDevice> devices) {
        this.devices = devices;
    }

    /**
     * Добавление определенного кол-ва
     * приборов.
     *
     * @param countOfDevices количество добавляемых
     *                       приборов
     */
    public void add(int countOfDevices) {
        for (int i = 0; i < countOfDevices; i++) {
            devices.add(getDevice());
        }
    }

}
