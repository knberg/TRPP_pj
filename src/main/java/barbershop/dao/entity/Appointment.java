package barbershop.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Класс записи на услугу. Создаётся в момент записи клиента в барбершоп.
 * Создаёт в базе данных таблицу с названием appointments.
 */

@Entity
@Table(name = "appointments")
@Getter
@Setter
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /** Поле клиент (имя). Соответствует столбцу с названием client. */
    @Column(name = "client")
    String client;

    /** Поле барбер (имя). Соответствует столбцу с названием master. */
    @Column(name = "master")
    String master;

    /** Поле дата. Соответствует столбцу с названием date.*/
    @Column(name = "date")
    String date;

    /** Поле время. Соответствует столбцу с названием time.*/
    @Column(name = "time")
    String time;
}
