




<jsp:include page="/WEB-INF/jsp/common/header.jsp" />



<div id="wrapper">
    <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bgm" >
        <div class="container-fluid d-flex flex-column p-0">
            <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                <div class="sidebar-brand-icon rotate-n-15"><i class="fas fa-laugh-wink"></i></div>
                <div class="sidebar-brand-text mx-3"><span>Admin</span></div>
            </a>
            <hr class="sidebar-divider my-0">
            <ul class="nav navbar-nav text-light" id="accordionSidebar">

                <li class="nav-item" role="presentation"><a class="nav-link " href="/employeeData"><i class="fa fa-database"></i><span>Data Management</span></a></li>

                <li class="nav-item" role="presentation"><a class="nav-link active" href="/salaryData"><i class="fas fa fa-money"></i><span>Salary Management</span></a></li>

                <li class="nav-item" role="presentation"><a class="nav-link " href="/leaveData"><i class="fas fa-house-leave"></i><span>Leave Management</span></a></li>

                <li class="nav-item" role="presentation"><a class="nav-link " href="/taskData"><i class="fas fa-window-maximize"></i><span>Task Management</span></a></li>

                <li class="nav-item" role="presentation"><a class="nav-link " href="/projectData"><i class="fas fa-graduation-cap"></i><span>Project Management</span></a></li>

            </ul>
            <div class="text-center d-none d-md-inline"><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button></div>
        </div>
    </nav>




    <div class="d-flex flex-column" id="content-wrapper">
        <div id="content">
            <nav class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
                <div class="container-fluid"><button class="btn btn-link d-md-none rounded-circle mr-3" id="sidebarToggleTop" type="button"><i class="fas fa-bars"></i></button>
                    <!--                    <form class="form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                                            <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                                <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                                            </div>
                                        </form>-->
                    <ul class="nav navbar-nav flex-nowrap ml-auto">
                        <li class="nav-item dropdown d-sm-none no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><i class="fas fa-search"></i></a>
                            <div class="dropdown-menu dropdown-menu-right p-3 animated--grow-in" role="menu" aria-labelledby="searchDropdown">
                                <form class="form-inline mr-auto navbar-search w-100">
                                    <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                        <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                                    </div>
                                </form>
                            </div>
                        </li>
                        <li class="nav-item dropdown no-arrow mx-1" role="presentation">
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="badge badge-danger badge-counter">3+</span><i class="fas fa-bell fa-fw"></i></a>
                                <div class="dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in"
                                     role="menu">
                                    <h6 class="dropdown-header">alerts center</h6>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="mr-3">
                                            <div class="bg-primary icon-circle"><i class="fas fa-file-alt text-white"></i></div>
                                        </div>
                                        <div><span class="small text-gray-500">December 12, 2019</span>
                                            <p>A new monthly report is ready to download!</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="mr-3">
                                            <div class="bg-success icon-circle"><i class="fas fa-donate text-white"></i></div>
                                        </div>
                                        <div><span class="small text-gray-500">December 7, 2019</span>
                                            <p>$290.29 has been deposited into your account!</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="mr-3">
                                            <div class="bg-warning icon-circle"><i class="fas fa-exclamation-triangle text-white"></i></div>
                                        </div>
                                        <div><span class="small text-gray-500">December 2, 2019</span>
                                            <p>Spending Alert: We've noticed unusually high spending for your account.</p>
                                        </div>
                                    </a><a class="text-center dropdown-item small text-gray-500" href="#">Show All Alerts</a></div>
                            </div>
                        </li>
                        <li class="nav-item dropdown no-arrow mx-1" role="presentation">
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><i class="fas fa-envelope fa-fw"></i><span class="badge badge-danger badge-counter">7</span></a>
                                <div class="dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in"
                                     role="menu">
                                    <h6 class="dropdown-header">alerts center</h6>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="/resources/vendor/css/assets/img/avatars/avatar4.jpeg">
                                            <div class="bg-success status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>Hi there! I am wondering if you can help me with a problem I've been having.</span></div>
                                            <p class="small text-gray-500 mb-0">Emily Fowler - 58m</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="/resources/vendor/css/assets/img/avatars/avatar2.jpeg">
                                            <div class="status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>I have the photos that you ordered last month!</span></div>
                                            <p class="small text-gray-500 mb-0">Jae Chun - 1d</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="/resources/vendor/css/assets/img/avatars/avatar3.jpeg">
                                            <div class="bg-warning status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>Last month's report looks great, I am very happy with the progress so far, keep up the good work!</span></div>
                                            <p class="small text-gray-500 mb-0">Morgan Alvarez - 2d</p>
                                        </div>
                                    </a>
                                    <a class="d-flex align-items-center dropdown-item" href="#">
                                        <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="/resources/vendor/css/assets/img/avatars/avatar5.jpeg">
                                            <div class="bg-success status-indicator"></div>
                                        </div>
                                        <div class="font-weight-bold">
                                            <div class="text-truncate"><span>Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</span></div>
                                            <p class="small text-gray-500 mb-0">Chicken the Dog · 2w</p>
                                        </div>
                                    </a><a class="text-center dropdown-item small text-gray-500" href="#">Show All Alerts</a></div>
                            </div>
                            <div class="shadow dropdown-list dropdown-menu dropdown-menu-right" aria-labelledby="alertsDropdown"></div>
                        </li>
                        <div class="d-none d-sm-block topbar-divider"></div>
                        <li class="nav-item dropdown no-arrow" role="presentation">
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="d-none d-lg-inline mr-2 text-gray-600 small">Valerie Luna</span><img class="border rounded-circle img-profile" src="/resources/vendor/css/assets/img/avatars/avatar1.jpeg"></a>
                                <div
                                    class="dropdown-menu shadow dropdown-menu-right animated--grow-in" role="menu"><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Profile</a><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Settings</a>
                                    <a
                                        class="dropdown-item" role="presentation" href="#"><i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Activity log</a>
                                    <div class="dropdown-divider"></div><a class="dropdown-item" role="presentation" href="/"><i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Logout</a></div>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>

            


            <div class="container-fluid">
                <div class="container my-4">


                    <p class="font-weight-bold">Basic examples</p>

                    <div class="row">





                        <!-- Grid column -->
                        <div class="col-xl-12 mb-4 mb-xl-0">



                            <!-- Section: Live preview -->
                            <section>

                                <ul class="nav nav-tabs" id="myTab" role="tablist">


                                    <li class="nav-item waves-effect waves-light">
                                        <a class="nav-link" id="home-tab" data-toggle="tab" href="#insert" role="tab" aria-controls="home" aria-selected="false">Insert Employee Data</a>
                                    </li>


                                    <li class="nav-item waves-effect waves-light">
                                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#update" role="tab" aria-controls="profile" aria-selected="false">Update Employee Data</a>
                                    </li>


                                    <li class="nav-item waves-effect waves-light">
                                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#view" role="tab" aria-controls="profile" aria-selected="false">View Employee Data</a>
                                    </li>
                                    
                                    
                                    
                                    
                                    <li class="nav-item waves-effect waves-light">
                                        <a class="nav-link" id="profile-tab"  href="/empV" role="tab" aria-controls="profile" aria-selected="false">View Employees DataTable</a>
                                    </li>


                                    <li class="nav-item waves-effect waves-light">
                                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#delete" role="tab" aria-controls="profile" aria-selected="false">Delete Employee Data</a>
                                    </li>


                                </ul>



                                <div class="tab-content" id="myTabContent">

                                    <!-- Insert Section-->



                                    <div class="tab-pane fade" id="insert" role="tabpanel" aria-labelledby="home-tab">

                                        <section>

                                            <div class="container-fluid">
                                                <div class="container mt-5">
                                                    <div><h4 class="p-0 m-0 pb-3 d-flex justify-content-center">Insert Employee Details</h4></div>






                                                    <form action="/save" method="post">
                                                        <div class="form-row p-0 m-0">

                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Employee Id" name="empid"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Employee Name" name="empname"></div>
                                                                <!--                                <div class="form-group"><input class="form-control" type="text"  placeholder="Department" name="empdep"></div>-->


                                                                <div class="form-group">
                                                                    <select class="form-control" name="empdep">

                                                                        <option value="IT">IT</option>
                                                                        <option value=" Accounts"> Accounts</option>
                                                                        <option value="Public Relations">Public Relations</option>
                                                                        <option value="Law">Law</option>

                                                                    </select>

                                                                </div>









                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Designation" name="empdeg"></div>
                                                                <!--                                 <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Phone Number" name="empphn"></div>

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Email" name="empemail"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Address" name="empaddress"></div>
                                                                <div class="form-group"><input class="form-control" type="date" placeholder="Date Of Birth" name="empbirth"></div>



                                                                <!--                                 <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" >

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Employee NID" name="empnid"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Blood Group" name="empbgroup"></div>
                                                                <!--                                 <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div> 
                                                                                                 <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div> 
                                                                                                 <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3">

                                                                <div class="form-group"><input class="form-control" type="date" placeholder="Joing Date" name="empjdate"></div>
                                                                <div class="form-group"><input class="form-control" type="date" placeholder="Quit Date" name="empqdate"></div>
                                                                <!--                                 <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                                                <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                                                <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>






                                                            <div class="col-lg-12 col-xl-12 d-flex justify-content-center">

                                                                <label style="color:#2B547E;font-size: 16px">Gender:</label> &nbsp; &nbsp; &nbsp;
                                                                <div>
                                                                    <label for="male">Male</label>

                                                                    <input type="radio" id="male" name="gender" value="male">
                                                                </div>

                                                                &nbsp;
                                                                &nbsp;
                                                                &nbsp;
                                                                &nbsp;
                                                                <div>
                                                                    <label for="male">Female</label>

                                                                    <input type="radio" id="female" name="gender" value="female">
                                                                </div>





                                                            </div>


                                                            <div class="col p-0 m-0 p-3 d-flex justify-content-end"><button class="btn btn-primary btn-block" type="submit">Submit</button></div> 


                                                            <!--                            <div class="col p-0 m-0 p-3 d-flex justify-content-end"><input type="submit" value="Submit"/></div>-->
                                                        </div>
                                                    </form>











                                                    <!-- <form action="/save" method="post">
                                                                            <div class="form-row p-0 m-0">
                                                                                
                                                                                <div class="col-lg-6 col-xl-6 p-0 m-0 p-3">
                                                                                    
                                                                                   <input  type="text" placeholder="Employee Id" name="empid">
                                                                                  <input  type="text" placeholder="Employee Name" name="empname">
                                                                                  <input  type="text"  placeholder="Department" name="empdep">
                                                                                  <input type="text" placeholder="Designation" name="empdeg">
                                                                                     <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> 
                                                                             
                                                                                    
                                                                                    <input  type="text" placeholder="Phone Number" name="empphn">
                                                                                    
                                                                                    <input type="text" placeholder="Email" name="empemail">
                                                                                    <input type="text"  placeholder="Address" name="empaddress">
                                                                                    <input  type="text" placeholder="Date Of Birth" name="empbirth">
                                                                                     <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> 
                                                                                    <input  type="text" placeholder="Gender" name="empgen">
                                                                              
                                                                                   
                                                                                    <input  type="text" placeholder="Employee NID" name="empnid">
                                                                                    <input type="text" placeholder="Blood Group" name="empbgroup">
                                                                                     <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div> 
                                                                                     <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div> 
                                                                                     <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> 
                                                                          
                                                                             
                                                                                   
                                                                                   <input  type="text" placeholder="Joing Date" name="empjdate">
                                                                                   <input  type="text" placeholder="Quit Date" name="empqdate">
                                                                                     <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                                    <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                                    <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> 
                                                                           
                                                    
                                                                              
                                                                                
                                                                              
                                                                                
                                                                                
                                                                                <div class="col-lg-12 col-xl-12 d-flex justify-content-center">
                                                                                    
                                                                                    <label style="color:#2B547E;font-size: 16px">Gender:</label> &nbsp; &nbsp; &nbsp;
                                                                                    <div>
                                                                                        <label for="male">Male</label>
                                                                                     
                                                                                        <input type="radio" id="male" name="gender" value="male">
                                                                                    </div>
                                                                                          
                                                                                            &nbsp;
                                                                                            &nbsp;
                                                                                            &nbsp;
                                                                                            &nbsp;
                                                                                            <div>
                                                                                                <label for="male">Female</label>
                                                                                             
                                                                                                <input type="radio" id="female" name="gender" value="female">
                                                                                            </div>
                                                                                           
                                                    
                                                                                     
                                                                               
                                                    
                                                                                </div>
                                                                                
                                                    
                                                                                 <div class="col p-0 m-0 p-3 d-flex justify-content-end"><button class="btn btn-primary btn-block" type="button">Submit</button></div> 
                                                    
                                                    
                                                                                <div class="col p-0 m-0 p-3 d-flex justify-content-end">
                                                                                    <input type="submit" value="Submit"/>
                                                                                </div>
                                                                            </div>
                                                                        </form>-->






                                                </div>
                                            </div>
                                        </section>

                                    </div>






















                                    <!--Update Section   -->
                                    <div class="tab-pane fade" id="update" role="tabpanel" aria-labelledby="profile-tab">




                                        <section>



                                            <div class="container-fluid">
                                                <div class="container mt-5">
                                                    <div ><h4 class="p-0 m-0 pb-3 d-flex justify-content-center">Update Employee Details</h4></div>

                                                    <form class="form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                                                        <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                                            <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                                                        </div>
                                                    </form>


                                                    <form>
                                                        <div class="form-row p-0 m-0">

                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div> -->
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div> -->
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>












                                                            <div class="col p-0 m-0 p-3 d-flex justify-content-end"><button class="btn btn-primary btn-block" type="button">Update</button></div>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </section>





                                    </div>





                                    <!-- View Section-->

            <div class="container-fluid">
                <div class="container my-4">


                    <p class="font-weight-bold">Basic examples</p>
                    
                    
                    

                    <div class="row">

                        <!-- Grid column -->
                        <div class="col-xl-12 mb-4 mb-xl-0">



                            <!-- Section: Live preview -->
                            
                            
     <table class="table dataTable my-0 table-bordered" id="dataTable">
                                <thead>
                                    <tr>
                                        <th> Employee Id</th>
                                        <th> Employee  Name</th>
                                        <th> Department</th>
                                        <th> Designation</th>
                                        <th> Phone</th>
                                        <th> Email</th>
                                        <th> Address</th>
                                        <th> Date Of Birth</th>
                                        <th>Gender</th>
                                        <th>NID</th>
                                        <th>Blood Group</th>
                                        <th>Joining Date</th>
                                        <th>Quit Date</th>
                                        

                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach items="${map.employees}" var="val">

                                        <tr>

                                            <td>${val.empId}</td>
                                            <td>${val.empName}</td>
                                            <td>${val.empDep}</td>
                                            <td>${val.empDeg}</td>
                                            <td>${val.empPhn}</td>
                                            <td>${val.empEmail}</td>
                                            <td>${val.empAddress}</td>
                                            <td>${val.empBirth}</td>
                                            <td>${val.empGen}</td>
                                            <td>${val.empNid}</td>
                                            <td>${val.empBgroup}</td>
                                            <td>${val.empJdate}</td>
                                            <td>${val.empQdate}</td>

                                        </tr>
                                    </c:forEach>


                                </tbody>

                            </table>           

                            
                            
                            
                            
                            
                            
                            
                            
                            
                            <!-- Section: Live preview -->

                        </div>
                        <!-- Grid column -->

                        <!-- Grid column -->
                        <div class="col-xl-6">





                        </div>
                        <!-- Grid column -->

                    </div>
                    
                    
                    
                    

                </div>
            </div>








                                    <!--Delete Section-->

                                    <div class="tab-pane fade" id="delete" role="tabpanel" aria-labelledby="profile-tab">
                                        <section>



                                            <div class="container-fluid">
                                                <div class="container mt-5">
                                                    <div ><h4 class="p-0 m-0 pb-3 d-flex justify-content-center">Delete Employee Details</h4></div>

                                                    <form class="form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                                                        <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                                            <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                                                        </div>
                                                    </form>


                                                    <form >
                                                        <div class="form-row p-0 m-0">

                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div> -->
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div> -->
                                                                <!-- <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>
                                                            <div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Name"></div>
                                                                <div class="form-group"><input class="form-control" type="text" placeholder="Apellidos"></div>
                                                                <!-- <div class="form-group"><input class="form-control" type="email" required="" placeholder="Correo electrónico"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" placeholder="Celular / Teléfono"></div>
                                                                <div class="form-group"><input class="form-control" type="tel" required="" placeholder="LinkedIn"></div> -->
                                                            </div>












                                                            <div class="col p-0 m-0 p-3 d-flex justify-content-end"><button class="btn btn-primary btn-block" type="button">Delete</button></div>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </section>


                                    </div>


































                                </div>

                            </section>
                            <!-- Section: Live preview -->

                        </div>
                        <!-- Grid column -->

                        <!-- Grid column -->
                        <div class="col-xl-6">





                        </div>
                        <!-- Grid column -->

                    </div>

                </div>
            </div>
        </div>
        <footer class="bg-white sticky-footer">
            <div class="container my-auto">
                <div class="text-center my-auto copyright"><span>Copyright © Admin 2020</span></div>
            </div>
        </footer>
    </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a></div>




<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
