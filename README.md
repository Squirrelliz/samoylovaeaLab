Bank Management System
Описание проекта
Этот проект представляет собой упрощенную симуляцию системы управления банками, включающую такие сущности, как банки, банкоматы, банковские офисы, сотрудники, клиенты, кредитные и платежные счета. Каждая сущность имеет свои поля и поведение, а для взаимодействия с данными используются CRUD операции.

Основные сущности
Bank – объект банка, содержит информацию о количестве офисов, банкоматов, сотрудников, клиентов, рейтинге банка, общей сумме денег и процентной ставке.

BankAtm – объект банкомата, включающий в себя статус работы, адрес, принадлежность к банку и офису, количество денег в банкомате и возможность операций по снятию и внесению денег.

BankOffice – объект банковского офиса, хранит информацию о статусе работы офиса, количестве банкоматов, возможности оформления кредита, суммы денег и арендной стоимости офиса.

CreditAccount – объект кредитного счета, связанный с пользователем, банком, сотрудником и платежным счетом. Включает данные о сроке кредита, процентной ставке и ежемесячных платежах.

Employee – объект сотрудника банка, содержащий информацию о должности, возможности выдачи кредитов, зарплате и месте работы (в офисе или удаленно).

PaymentAccount – объект платежного счета, который хранит баланс клиента и связан с банком и пользователем.

User – объект клиента банка, содержит данные о месте работы, ежемесячном доходе, кредитном рейтинге и списках банков, кредитных и платежных счетов.
