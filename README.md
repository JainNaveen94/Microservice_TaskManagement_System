# Microservice_TaskManagement_System

***It is a MicroService Backend Application or RestAPI Application which Basically Provide the APIs For Task Management between Employees***

## Micro-Services List ::

  1. **EmployeeService** => For Getting Employee Detail such as Specific Employee Detail or List of Employees etc.
  2. **TaskService** => For Getting Task Available in the System which assigned to Employees.
  3. **DeshBoardService** => For Aggregate the Data From Both Above Service to Provide Employee Wise List of Task and Particular Employee Task.
  4. **EurekaNamingService** => Naming Service for Other Services Registery and Discovery Purpose.
  5. **ZuulAPIGatewayService** => API Gateway Provided by Netflix to route the Requested Service from it.
  
## Port Address For The Micro-Services

| **Service Name**  | **URL:Port Address** |
| ------------- | ------------- |
| **EmployeeService**  | http://localhost:6000  |
| **TaskService**  | http://localhost:7000  |
| **DeshboardService**  | http://localhost:8000 |
| **EurekaService**  | http://localhost:8761  |
| **APIGateway**  | http://localhost:8765  |


## Some Samples of URIs Calls

| **Service Name** | **URI Calls**  |
| ------------- |------------- |
| **EmployeeService**  | http://localhost:6000/employee/Emp010111-03 |
| **EmployeeService**  | http://localhost:6000/employee/list |
| **TaskService**  | http://localhost:7000/task/employee/Emp010111-04 |
| **TaskService**  | http://localhost:7000/task/employee/list |
| **DeshboardService**  | http://localhost:8000/dashboard/employee/task_list/Emp010111-06 |
| **DeshboardService**  | http://localhost:8000/dashboard/employee/task_list |
| **APIGateway**  | http://localhost:8765/employeeservice/employee/Emp010111-03 |
| **APIGateway**  | http://localhost:8765/taskservice/task/employee/Emp010111-04  |
| **APIGateway**  | http://localhost:8765/dashboardservice/dashboard/employee/task_list/Emp010111-06  |


## Please Note ::
  1. All Services required Configration are available in **application.properties** file so change it as per your Requirement.
  2. For Any Futher Help if you need in it then just Message me on Git, i will Provide Solution for it.


### ***(@-@) Thank you (@-@)***
