﻿# Дипломный проект по автоматизации тестирования API сайта [reqres.in](https://reqres.in/)

 
![reqres_logo](media/logo/reqres_logo.png)
 
## :bricks: Содержание 

* <a href="#annotation">Описание проекта</a>
* <a href="#tools">Технологии и инструменты</a>
* <a href="#cases">Реализованные проверки</a>
* <a href="#console">Запуск тестов из терминала</a>
* <a href="#jenkins">Запуск тестов в Jenkins</a>
* <a href="#allure">Отчет о результатах тестирования в Allure Report</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>
* <a href="#telegram">Уведомления в Telegram</a>

<a id="annotation"></a>
## :memo: Описание проекта
Проект направлен на тестирование интерфейса прикладной программы (API) сайта [reqres.in](https://reqres.in/) с целью убедиться, что интерфейс соответствует ожидаемой функциональности, безопасности, производительности и надежности. 

Тесты в проекте выполняются путем отправки запросов к конечным точкам API и сравнения ответа с ожидаемыми результатами.

Разработанная тестовая документация охватывает две функциональности: 
- <code>Пользовательские данные</code>
- <code>Регистрация пользователя</code>

Проект является дипломной работой по итогам обучения в школе автоматизации тестирования [qa.guru](https://qa.guru/) и выполнен с учетом полученных знаний и навыков:
- автотесты написаны на `Java` с использованием фреймворка `Selenide`
- тестовые данные сгенерированы с помощью `Java Faker`
- для работы с REST-службами на Java используется библиотека `Rest-assured`
- тестовая документация оформлена с использованием аннотаций `Allure`
- для получения информативной отчетности с вложениями подключены `Allure Reports` и `Allure TestOps`
- для отслеживания статусов заведенных задач и дефектов в багтрекере реализована интеграция `Allure TestOps` с `Jira`
- настроена отправка уведомлений в `Telegram` о результатах прохождения автотестов      

<a id="tools"></a>
## :hammer_and_wrench: Технологии и инструменты

<p align="left">
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media\logo\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
<a href="https://qameta.io/"><img src="media\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO" title="Allure_TO"></a>
<a href="https://www.jira.com/"><img src="media\logo\Jira.svg" width="50" height="50" alt="Jira" title="Jira"></a>
</p>

<code>Gradle</code> — для автоматизации сборки\
<code>JUnit5</code> — для выполнения тестов\
<code>Selenoid</code> — для удаленного запуска браузера в Docker контейнерах\
<code>REST Assured</code> — для тестирования REST-API сервисов\
<code>Jenkins</code> — CI/CD для запуска тестов удаленно\
<code>Allure Report</code> — для визуализации результатов тестирования\
<code>Allure TestOps</code> — как система управления тестированием\
<code>Jira</code> — как инструмент управления проектом и таск-трекер\
<code>Telegram Bot</code> — для уведомлений о результатах тестирования

<a id="cases"></a>
## :clipboard: Реализованные проверки

<code>Пользовательские проверки</code>
-  Создание пользователя с валидным именем и профилем деятельности
-  Изменение имени существующего пользователя
-  Удаление существующего пользователя
-  Получение информации о существующем пользователе

<code>Негативные проверки на регистрацию пользователя</code>
-  Регистрация пользователя без указания пароля
-  Регистрация пользователя без указания почты

<a id="console"></a>
## :computer: Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test
```
### Удаленный запуск тестов
```
clean
api_test
-Dbrowser=${browser}
-Dbrowser_version=${browser_version}
-Dbrowser_size=${browser_size}
-Dremote_url=${remote_url}
```
<sub>**где:**</sub>\
<sub><code>browser</code> – браузер</sub>\
<sub><code>browser_version</code> – версия браузера</sub>\
<sub><code>browser_size</code> – размер окна браузера</sub>\
<sub><code>remote_url</code> - адрес удаленного сервера, на котором будут запускаться тесты</sub>

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/18-ikorovina91-diploma-api-reqres/)
Для запуска тестов в **Jenkins** необходимо нажать кнопку **Собрать с параметрами**, установить параметры сборки и кликнуть по кнопке **Собрать**

<p align="center">
  <img src="media/screenshots/sborka_jenkins.png" alt="Jenkins" width="1000">
</p>

После завершения прогона для просмотра будут доступны артефакты запуска и полезные ссылки в целях более детального изучения результатов прохождения тестов

<p align="center">
  <img src="media/screenshots/jenkins_results.png" alt="Jenkins" width="1000">
</p>

<a id="allure"></a>
## <img src="media/logo/Allure_Report.svg" width="25" height="25"/></a> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/18-ikorovina91-diploma-api-reqres/5/allure/)

Одним из результатов сборки является **Allure Report**, в котором помимо просмотра итогового отчета на странице теста можно ознакомиться с пошаговым выполнением кода

<sub>Пример отображения итогового отчета</sub>
<p align="center">
  <img src="media/screenshots/allure_overview.png" alt="allure" width="1000">
</p>

<sub>Пример отображения результатов проверок в разрезе тестов</sub>
<p align="center">
  <img src="media/screenshots/allure.png" alt="allure" width="1000">
</p>

<a id="allure-testops"></a> 
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/2537/dashboards)

Реализованная в проекте интеграция с **Allure TestOps** позволяет не только ознакомиться с отчетом о результатах прохождения тестов, но и запускать автотесты и наблюдать за результатом их выполнения в режиме реального времени. При этом, возможности Allure TestOps позволяют выбирать, какие именно тесты запускать. 

<sub>Пример отображения раздела Dashboard</sub>
<p align="center">
  <img src="media/screenshots/allure_dashboard.png" alt="allure-testops" width="1000">
</p>

<sub>Пример отображения раздела Launches</sub>
<p align="center">
  <img src="media/screenshots/allureOPS_launches.png" alt="allure-testops" width="1000">
</p>

<sub>Возможность вапуска теста из Allure TestOps</sub>
<p align="center">
  <img src="media/screenshots/run_tests_allure.png" alt="allure-testops" width="1000">
</p>

<a id="jira"></a> 
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-726)

Реализованная интеграция с **Jira** позволяет отслеживать статус заведенных задач и дефектов в багтрекере 

<sub>Пример задачи, прилинкованной к тест-кейсам и прогону</sub>
<p align="center">
  <img src="media/screenshots/jira.png" alt="jira" width="1000">
</p>

<a id="telegram"></a> 
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram

После завершения прогона в Jenkins с помощью бота осуществляется отправка уведомления в **Telegram** о результатах прохождения тестов

<sub>Пример уведомления</sub>
<p align="left">
  <img src="media/screenshots/telegram.png" alt="telegram" width="500">
</p>
