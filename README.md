# StrudentDetail
Manage student project using spring boot all CRUD operation perform, in memory

# Model
Student :
*    roll_no
*    name
*    gender
*    age
*    branch
*    year
*    semester

# Flow 
UI(we use postman) <--> StudentController(C) <--> 
StudentService(I) <--> StudentServiceImpl(C) <--> 
StudentRepo(I) <--> StudentRepoImpl(C)