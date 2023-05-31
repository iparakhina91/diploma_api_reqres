# Дипломный проект по автоматизации тестирования API для [reqres.in](https://reqres.in/)

 
![reqres_logo](media/logo/reqres_logo.png)
 
## :bookmark_tabs: Содержание 

* <a href="#annotation">Описание проекта</a>
* <a href="#tools">Использованный стек технологий</a>
* <a href="#cases">Реализованные проверки</a>
* <a href="#console">Запуск тестов из терминала</a>
* <a href="#jenkins">Запуск тестов в Jenkins</a>
* <a href="#allure">Отчет о результатах тестирования в Allure Report</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>
* <a href="#telegram">Уведомления в Telegram</a>

<a id="annotation"></a>
## :hammer_and_wrench: Описание проекта
Проект состоит из API тестов, в результате которых анализируется интерфейс прикладной программы (API) сайта [reqres.in](https://reqres.in/). Тесты выполняются путем отправки запросов к конечным точкам API и сравнения ответа с ожидаемыми результатами.

<code>Цель тестирования</code> - убедиться, что интерфейс прикладной программы соответствует ожидаемой функциональности, безопасности, производительности и надежности. 

<code>Интересные факты о проекте</code>
- [x] Для генерации тестовых данных использована библиотека `Faker`
- [x] Оформление тестовой документации реализовано посредством аннотаций `Allure`
- [x] Для создания подробных отчетов реализована интеграция с `Allure TestOps`
- [x] Проект интегрирован с `Jira`
- [x] Настроена отправка уведомлений в `Telegram` о результатах прохождения автотестов   

<a id="tools"></a>
## :hammer_and_wrench: Использованный стек технологий

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

Автотесты в данном проекте написаны на Java с использованием фреймворка [Selenide](https://selenide.org/).\
<code>Gradle</code> — используется как инструмент автоматизации сборки.\
<code>JUnit5</code> — для выполнения тестов.\
<code>Selenoid</code> — для удаленного запуска браузера в Docker контейнерах.\
<code>REST Assured</code> — для тестирования REST-API сервисов.\
<code>Jenkins</code> — CI/CD для запуска тестов удаленно.\
<code>Allure Report</code> — для визуализации результатов тестирования.\
<code>Allure TestOps</code> — как система управления тестированием.\
<code>Jira</code> — как инструмент управления проектом и таск-трекер.\
<code>Telegram Bot</code> — для уведомлений о результатах тестирования.

<a id="cases"></a>
## :clipboard: Реализованные проверки

-  Users tests
   -  Create user with valid name and job
   -  Update name of user with existed id
   -  Delete user with existed id
   -  Get info about existed user
-  Register tests
   -  Register user without password
   -  Register user without email

<a id="console"></a>
## :technologist: Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test
```
### Удаленный запуск тестов
```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteUrl=${REMOTE_URL}
```
<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/)
Для запуска необходимо нажать "Собрать сейчас"
При клике на сборку после завершения можно увидеть артефакты запуска и полезные ссылки для более детального изучения результатов прогона.

<a id="allure"></a>
## <img src="media/logo/Allure_Report.svg" width="25" height="25"/></a> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/)

<a id="allure-testops"></a> 
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/)

<a id="jira"></a> 
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/)

<a id="telegram"></a> 
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram
