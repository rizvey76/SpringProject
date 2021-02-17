


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/jsp/common/header.jsp" />




<div id="wrapper">
        
        <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bgm">
            <div class="container-fluid d-flex flex-column p-0">
                <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                    <div class="sidebar-brand-icon rotate-n-15"></div>
                    <div class="sidebar-brand-text mx-3"><span>Employee</span></div>
                </a>
                <hr class="sidebar-divider my-0">
                <ul class="nav navbar-nav text-light" id="accordionSidebar">
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="#"><i class="fas fa-tachometer-alt"></i><span>Dashboard</span></a></li>
                    
                    
        <br/>
<!--        <br/>
        <br/>
        
        <li class="nav-item" role="presentation" style="margin:0 0 15px 0;">
            <form action="#" method="post">
                <input type="hidden" name="empId" value="${empIdp}"/>
                
                
                <input type="submit" value="Edit Profile" style="color: white"  class="bgm ou" />
     
            </form>
        </li>
        -->
        

        
        
         <li class="nav-item" role="presentation" style="margin:0 0 15px 0;">
            <form action="/empAttendance" method="post">
                <input type="hidden" name="empId" value="${empIdp}"/>
                
                
                <input type="submit" value="Submit Attendance" style="color: white"  class="bgm ou" />
     
            </form>
        </li>
        
        
        
                   
                    
<!--                     <li class="nav-item" role="presentation"><a class="nav-link " href="/emplev"><i class="fas fa-house-leave"></i><span>Apply Leave</span></a></li>-->
        <li class="nav-item" role="presentation" style="margin:0 0 15px 0;">
            <form action="/emplev" method="post">
                <input type="hidden" name="empId" value="${empIdp}"/>
                
                
                <input type="submit"  value="Apply Leave" style="color: white" class="bgm ou">
     
            </form>
        </li>
        
       
        
          
          
        <li class="nav-item" role="presentation">
            <form action="/empTaskTable" method="post">
                <input type="hidden" name="empId" value="${empIdp}"/>
                
                
                <input type="submit" value="View Task" style="color: white"  class="bgm ou" />
     
            </form>
        </li>
        
        
                    
                    <li class="nav-item" role="presentation"></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="login.html"><span></span></a></li>
                    <li class="nav-item" role="presentation"></li>
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
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="badge badge-danger badge-counter"></span><i class="fas fa-bell fa-fw"></i></a>
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
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><i class="fas fa-envelope fa-fw"></i><span class="badge badge-danger badge-counter"></span></a>
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
                                            <p class="small text-gray-500 mb-0">Chicken the Dog � 2w</p>
                                        </div>
                                    </a><a class="text-center dropdown-item small text-gray-500" href="#">Show All Alerts</a></div>
                            </div>
                            <div class="shadow dropdown-list dropdown-menu dropdown-menu-right" aria-labelledby="alertsDropdown"></div>
                        </li>
                        <div class="d-none d-sm-block topbar-divider"></div>
                        <li class="nav-item dropdown no-arrow" role="presentation">
                            <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="d-none d-lg-inline mr-2 text-gray-600 small"></span><img class="border rounded-circle img-profile" src="/resources/vendor/css/assets/img/avatars/emp.png"></a>
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
                
<!--             GeneratedArea   -->


                <div class="container my-4">

                     <div>

                                        <div class="row">
                                            <div class="col">

                                                <form action="/updateTask" method="post">

                                                    
                                                    <fieldset class="border p-2">
                                                        
                                                        <input type="hidden" name="id" value="${task.id}"/>



                                                        <legend> <h4 style="color: #002752">Project Details</h4></legend>
                                                        <div class="d-flex justify-content-center"><label for="exampleFormControlTextarea1"><h3 style="color: #06f318">Project Code:&nbsp;${task.taskId}</h3></label></div>
                                                      
                                                      


                                                        
                                                     
                                                        <div class="d-flex justify-content-center"> <label for="exampleFormControlTextarea1"><h3 style="color: #002752">Project Title:&nbsp;${task.taskName} </h3></label></div>
                                                         
                                                        <br/>
                                                        
                                                        <div class="d-flex justify-content-start">
                                                            <label for="exampleFormControlTextarea1"><h5 style="color:#28f014 "> Assigned Date: &nbsp;${task.assignDate} </h5></label> 
                                                            
                                                        </div>
                                                        
                                                        
                                                       <div class="d-flex justify-content-start">
                                                        <label for="exampleFormControlTextarea1"><h5 style="color:#077e22 "> Start Date: &nbsp;${task.startDate} </h5></label> 
                                                         </div>
                                                       
                                                         <div class="d-flex justify-content-start">
                                                        <label for="exampleFormControlTextarea1"><h5 style="color:#f90505"> Estimated Date To Finish: &nbsp;${task.estmDate} </h5></label>  
                                                         </div>
                                                        <br/>
                                                        
                                                        
                                                        
                                                        <fieldset class="border p-2">
                                                            <legend style="color: #002752">Details:</legend>
                                                              <div class="card text-center">
                                                           <div class="card-header">
                                                               <h5 style="color:#030f4f "> <u> Details About Project</u></h5>
                                                                      </div>
                                                             <div class="card-body">
   
                                                                 <p class="card-text" style="color: #0e32f1"> 
                                                                     <strong>  ${task.description}</strong>
                                                              </p>
    
                                                                   </div>
                                                      
                                                                   </div>
                                                               
  
                                                        </fieldset>










                                                            
                                                            
                                                            
                                                            <br/>
                                                            
                                                            <label for="exampleFormControlTextarea1" style="color: #081e55">Status:</label>
                                                            <div class="form-group">
                                                                    <select class="form-control" name="taskStatus">

                                                                     
                                                                        <option value="In Progress">In Progress</option>
                                                                        <option value="On hold">On hold</option>
                                                                        <option value="Done">Done</option>
                                                                      

                                                                    </select>

                                                                </div>

                                                            
                                                            
                                                             <br/>
                                                            
                                                           
                                                         <div class="d-flex justify-content-center"><input type="submit" class="btn btn-primary btn-lg active" value="Post Status"/></div>

                                                            







                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            



                                                   
                                                    </fieldset>


                                                </form>


                                            </div>
                                                        
                                                        
                                                        

                                        </div>

                                    </div>
                    
                    
                    
           

                </div>

        
<!--        generateAreaFinsh-->
        
        
        
        
            </div>
                                            
                                            
                                            
                                            
        </div>
        <footer class="bg-white sticky-footer">
            <div class="container my-auto">
                <div class="text-center my-auto copyright"><span>Copyright � Admin 2020</span></div>
            </div>
        </footer>
    </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a></div>




<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
