package step.android.helloproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hiButton = findViewById(R.id.hiButton);
        hiButton.setOnClickListener(v -> {
            TextView label = findViewById(R.id.helloLabel);
            label.setText(R.string.greetings2);
        });

        TextView label = findViewById(R.id.countLabel);

        Button plusButton = findViewById(R.id.buttonPlus);
        plusButton.setOnClickListener(v -> {
            try
            {
                String countStr = (String) label.getText();
                int count = Integer.parseInt(countStr.trim());
                count++;
                label.setText(String.valueOf(count));

                System.out.println("int count = " + count);
            }
            catch (NumberFormatException nfe)
            { System.out.println("NumberFormatException: " + nfe.getMessage()); }
        });

        Button minusButton = findViewById(R.id.buttonMinus);
        minusButton.setOnClickListener(v -> {

            try
            {
                String countStr = (String) label.getText();
                int count = Integer.parseInt(countStr.trim());
                count--;
                label.setText(String.valueOf(count));
                System.out.println("int count = " + count);
            }
            catch (NumberFormatException nfe)
            { System.out.println("NumberFormatException: " + nfe.getMessage()); }
        });

    }
}

/*
Инкрементальный калькулятор:
число и две кнопки
одна уменьшает число на 1,
другая увеличивает
 */
/*
* Структура проекта
  В проекте просматриваются две структурные части:
  - код
  - ресурсы

  Кодовая часть оформляется по принципам Java
  Ресурсная часть - набор декларативных файлов (.xml),
  содержащих для проекта:
  - внешний вид (drawable)
  - разметка (layout)
  - значения (values)
    - strings - именованые строковые ресурсы

 */

/*
 Установка и настройка ПО
 1.  Android Studio
 1.1. При установке также ставится SDK и требуется JRE
 2.  Create new project. Шаблон проекта загружается
     их новых, возможно, он будет несовместим с настройками
     студии, особенно, если она установлена ранее. В таком
     случае:
     - понизить API в настройках Gradle (build.gradle)
     - понизить версию Gradle для проекта (в свойствах
     проекта)
 3. Эмулятор:
    а) встроенные средства (Device Manager)
    б) стороннее ПО (обычно, для не-Intel систем)
    Для запуска эмулятора должна быть включена
    виртуализация (BIOS)
 3.1 Реальное устройство:
    а) включить режим разработчика (см. инструкцию к устройству)
    б) через меню разработчика разрешаем USB отладку и
       установку программ
    в) использовать Data-кабель (Убедиться, что не только
       зарядный)
    г) при подключении телефона выбрать режим "передвча файлов"
       и разрешить обмен данными с ПК
 */