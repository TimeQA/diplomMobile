# Проект по автоматизации тестирования страницы Selecty
## :page_facing_up: Содержание:

* [Технологии и инструменты](#technologist-технологии-и-инструменты)
* [Реализованы проверки](#bookmark_tabs-реализованы-проверки)
* [Запуск тестов из терминала](#computer-Запуск-тестов-из-терминала)
* [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
* [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-allure-report)
* [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
* [Интеграция с Jira](#-интеграция-с-jira)
* [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
* [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid)

## :computer: Использованный стек технологий

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Selenoid" src="images/logo/Selenoid.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/Selenide.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="GitHub" src="images/logo/GitHub.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Browserstack.svg"></code>
</p>


> *В данном проекте автотесты написаны на <code><strong>*Java*</strong></code> с использованием фреймворка <code><strong>*Selenide*</strong></code> для UI-тестов.*
>
>*Для сборки проекта используется <code><strong>*Gradle*</strong></code>.*
>
>*<code><strong>*JUnit 5*</strong></code> используется как фреймворк для модульного тестирования.*
>
>*Запуск тестов выполняется из <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> используется для запуска браузеров в контейнерах  <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> используются для визуализации результатов тестирования.*

## :bookmark_tabs: Реализованы проверки

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI


>- [x] *Отказ в отслеживании локации*
>- [x] *Проверка главной страницы"*
>- [x] *Проверка работы работы поля для введения запроса*
>- [x] *Проверка работы поиска по продуктам магазина*


____

## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/15.Addition_to_the_cover_letter/">**Сборка в Jenkins**</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/15.Addition_to_the_cover_letter/"><img src="images/JenkinsJob.png" alt="Jenkins"/></a>  
</p>


### *Параметры сборки в Jenkins:*

- *TASK (запуск любого теста отдельно)*

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> *Allure* <a target="_blank" href="https://jenkins.autotests.cloud/job/15.Addition_to_the_cover_letter/32/allure/">*отчёт*</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/Allure_Report_Overview.png">  
</p>  

### *Тест кейсы*

<p align="center">  
<img title="Allure Tests" src="images/Test_cases.png">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/Allure_Graphs.png">  
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Selenoid"/></a> *Примеры видео выполнения тестов на Selenoid*



<img title="Selenoid Video" src="images/allTests.gif" width="650" height="350"  alt="video">   