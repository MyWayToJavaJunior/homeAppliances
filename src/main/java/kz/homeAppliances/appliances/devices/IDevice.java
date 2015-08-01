package kz.homeAppliances.appliances.devices;

import kz.homeAppliances.appliances.devices.devicesPlug.TypePlug;

/**
 * Типизирующий интерфейс
 */
public interface IDevice {
    /**
     * Включен ли прибор
     * в сеть.
     *
     * @return true если включен,
     * false если нет
     */
    boolean isOn();

    /**
     * Возвращает мощность прибора.
     *
     * @return мощность прибора
     */
    int getPower();

    /**
     * Получить название розетки.
     *
     * @return нахвание розетки
     */
    TypePlug getPlug();

    /**
     * Установить название розетки.
     *
     * @param plug новое название
     *             розетки
     */
    void setPlug(TypePlug plug);
}
