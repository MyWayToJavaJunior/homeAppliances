package kz.homeAppliances.appliances.devices;

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
}
