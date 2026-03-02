# 🍔 Stellar Burgers — Unit Tests (Praktikum)

## 🚀  Tech Stack

<p align="center">

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=28&duration=2500&pause=800&color=00C2FF&center=true&vCenter=true&width=800&lines=Java+11%2B;JUnit+4+Unit+Testing;Mockito+Mocking+Framework;JaCoCo+100%25+Code+Coverage;Maven+Build+Automation" />

</p>

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,maven,idea,github" height="70"/>
</p>

<p align="center">

<img src="https://img.shields.io/badge/JUnit4-Unit%20Testing-25A162?style=for-the-badge&logo=junit5&logoColor=white"/>
<img src="https://img.shields.io/badge/Mockito-Mocking-78A641?style=for-the-badge"/>
<img src="https://img.shields.io/badge/JaCoCo-100%25%20Coverage-BD1E2D?style=for-the-badge"/>

</p>
Unit tests for the educational project **Stellar Burgers**.
The goal is to cover the business logic with unit tests using **mocks, stubs, and parameterization**, achieving **100% code coverage with JaCoCo**.

---

## ✅ Task 1. Unit Testing

You need to test a program that helps users order a burger in Stellar Burgers.

### What has been done

* Connected dependencies: **JUnit 4**, **Mockito**, **JaCoCo**
* Implemented unit tests for the **`Burger`** class
* Used:

    * **Mocks (Mockito)** — for isolating dependencies and controlling behavior
    * **Stubs** — for simplified return values
    * **Parameterized tests** — for repetitive scenarios with different input data
* Achieved **100% test coverage** 🏁

---

## 🧰 Tech Stack

* ☕ **Java 11+**
* 🧪 **JUnit 4**
* 🎭 **Mockito**
* 📈 **JaCoCo**
* 🧱 **Maven**

---

## 📁 Project Structure

```
src
 ├── main
 │   └── java
 │       └── praktikum
 │           ├── Bun.java
 │           ├── Burger.java
 │           ├── Database.java
 │           ├── Ingredient.java
 │           ├── IngredientType.java
 │           └── Praktikum.java
 └── test
     └── java
         └── praktikum
             ├── BurgerTests.java
             ├── BurgerPriceTests.java
             ├── DatabaseTests.java
             ├── IngredientTests.java
             ├── IngredientTypeTests.java
             └── PraktikumTest.java
```

---

## ▶️ How to Run Tests

### Run all tests

```bash
mvn clean test
```

---

## 📊 JaCoCo Coverage Report

After running tests, the coverage report will be generated at:

```text
target/site/jacoco/index.html
```

Open `index.html` in your browser to verify that coverage equals **100%**.

---

## 🧩 What Is Tested

### `Burger`

* setting buns (`setBuns`)
* adding ingredients (`addIngredient`)
* removing ingredients (`removeIngredient`)
* moving ingredients (`moveIngredient`)
* price calculation (`getPrice`)
* receipt generation (`getReceipt`)

---

## 👤 Author Anna Krolchuk

QA Automation Educational Project 




# 🍔 Stellar Burgers — Юнит-тесты (Практикум)

![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.8%2B-C71A36?logo=apachemaven&logoColor=white)
![JUnit4](https://img.shields.io/badge/JUnit-4-25A162?logo=junit5&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-mocks-78A641?logo=java&logoColor=white)
![JaCoCo](https://img.shields.io/badge/JaCoCo-coverage-BD1E2D?logo=codecov&logoColor=white)

Юнит-тесты для учебного проекта **Stellar Burgers**.  
Цель — покрыть бизнес-логику приложения тестами с использованием **моков, стабов и параметризации**, а также добиться **100% покрытия по JaCoCo**.

---

## Задание 1. Юнит-тесты

Нужно протестировать программу, которая помогает заказать бургер в Stellar Burgers.

### Что сделано
- Подключены зависимости: **JUnit 4**, **Mockito**, **JaCoCo**
- Написаны юнит-тесты для класса **`Burger`**
- Использованы:
  - **моки** (Mockito) — для зависимостей/объектов, где важно поведение
  - **стабы** — для упрощения данных/ответов
  - **параметризация** — там, где проверяются одинаковые сценарии с разными входными данными
- Достигнуто **100% coverage** по JaCoCo 🏁

---

##  Tech Stack

- ☕ **Java 11+**
- 🧪 **JUnit 4**
- 🎭 **Mockito**
- 📈 **JaCoCo**
- 🧱 **Maven**

---

## 📁 Project Structure
```
src
├── main
│   └── java
│       └── praktikum
│           ├── Bun.java
│           ├── Burger.java
│           ├── Database.java
│           ├── Ingredient.java
│           ├── IngredientType.java
│           └── Praktikum.java
└── test
└── java
└── praktikum
├── BurgerTests.java
├── BurgerPriceTests.java
├── DatabaseTests.java
├── IngredientTests.java
├── IngredientTypeTests.java
└── PraktikumTest.java

```
---
## ▶️ Как запустить тесты


### Запуск всех тестов
```bash
mvn clean test
```

---

## 📊 JaCoCo Coverage

После прогона тестов отчёт хранится здесь:

```text
target/site/jacoco/index.html
```
---

## Что тестируем

### `Burger`

* выбор булочек (`setBuns`)
* добавление ингредиентов (`addIngredient`)
* удаление ингредиента (`removeIngredient`)
* перемещение ингредиента (`moveIngredient`)
* расчёт цены (`getPrice`)
* генерация чека (`getReceipt`)

---

## 👤 Автор: Корольчук Анна

Учебный проект QA Automation (Praktikum)
