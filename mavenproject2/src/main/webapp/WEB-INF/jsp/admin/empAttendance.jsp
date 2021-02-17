




<jsp:include page="/WEB-INF/jsp/common/header.jsp" />



<div id="page-top">
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
                <input type="hidden" name="empId" value="${empIdp}${empIda}"/>
                
                
                <input type="submit" value="Edit Profile" style="color: white"  class="bgm ou" />
     
            </form>
        </li>-->
        
        

        
        
         <li class="nav-item" role="presentation" style="margin:0 0 15px 0;">
            <form action="/empAttendance" method="post">
                <input type="hidden" name="empId" value="${empIdp}${empIda}"/>
                
                
                <input type="submit" value="Submit Attendance" style="color: white"  class="bgm ou" />
     
            </form>
        </li>
        
        
        
                   
                    
<!--                     <li class="nav-item" role="presentation"><a class="nav-link " href="/emplev"><i class="fas fa-house-leave"></i><span>Apply Leave</span></a></li>-->
        <li class="nav-item" role="presentation" style="margin:0 0 15px 0;">
            <form action="/emplev" method="post">
                <input type="hidden" name="empId" value="${empIdp}${empIda}"/>
                
                
                <input type="submit"  value="Apply Leave" style="color: white" class="bgm ou">
     
            </form>
        </li>
        
       
        
          
          
        <li class="nav-item" role="presentation">
            <form action="/empTaskTable" method="post">
                <input type="hidden" name="empId" value="${empIdp}${empIda}"/>
                <input type="hidden" name="empName" value="${empName}"/>
                
                
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
                        <form class="form-inline d-none d-sm-inline-block mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                            <div class="input-group"></div>
                        </form>
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
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar4.jpeg">
                                                <div class="bg-success status-indicator"></div>
                                            </div>
                                            <div class="font-weight-bold">
                                                <div class="text-truncate"><span>Hi there! I am wondering if you can help me with a problem I've been having.</span></div>
                                                <p class="small text-gray-500 mb-0">Emily Fowler - 58m</p>
                                            </div>
                                        </a>
                                        <a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar2.jpeg">
                                                <div class="status-indicator"></div>
                                            </div>
                                            <div class="font-weight-bold">
                                                <div class="text-truncate"><span>I have the photos that you ordered last month!</span></div>
                                                <p class="small text-gray-500 mb-0">Jae Chun - 1d</p>
                                            </div>
                                        </a>
                                        <a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar3.jpeg">
                                                <div class="bg-warning status-indicator"></div>
                                            </div>
                                            <div class="font-weight-bold">
                                                <div class="text-truncate"><span>Last month's report looks great, I am very happy with the progress so far, keep up the good work!</span></div>
                                                <p class="small text-gray-500 mb-0">Morgan Alvarez - 2d</p>
                                            </div>
                                        </a>
                                        <a class="d-flex align-items-center dropdown-item" href="#">
                                            <div class="dropdown-list-image mr-3"><img class="rounded-circle" src="assets/img/avatars/avatar5.jpeg">
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
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="d-none d-lg-inline mr-2 text-gray-600 small"><h5>${empName}${empNames}</h5></span><img class="border rounded-circle img-profile" src="/resources/vendor/css/assets/img/avatars/emp.png"></a>
                                    <div
                                        class="dropdown-menu shadow dropdown-menu-right animated--grow-in" role="menu"><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Profile</a><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Settings</a>
                                        <a
                                            class="dropdown-item" role="presentation" href="#"><i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Activity log</a>
                                            <div class="dropdown-divider"></div><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Logout</a></div>
                    </div>
                    </li>
                    </ul>
            </div>
            </nav>
                
                                    
                                    
                                    
                                   <!-------------------------------->
<!--                                   <div>
                                        <form action="/showHistoryData" method="post">
                                             <input type="text" class="form-control" placeholder="Requesting Days" name="empId" value="${empIdp}"/>
                                             <input type="submit" class="form-control" value="Submit"/>
                                        </form>
                                    </div>
            -->
            <!--------------------------------------------->
            
            
            
            <div class="container-fluid">
                <div class="container my-4">


<!--                    <p class="font-weight-bold">Basic examples</p>
                    <h1>${empIdp}${empIda}</h1>-->

                    <div class="row">

                        <!-- Grid column -->
                        <div class="col-xl-12 mb-4 mb-xl-0">



                            <!-- Section: Live preview -->
<!--                            <section>

                                <ul class="nav nav-tabs" id="myTab" role="tablist">
                                    <li class="nav-item waves-effect waves-light">
                                        <a class="nav-link" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="false">
                                            
                                           
                                                 <input type="submit" class="form-control ou btn2" value="Attendance"/>

                                         
                                            
                                        </a>
                                    </li>
                                    
                                    
                                    <li class="nav-item waves-effect waves-light">
                                        <a class="nav-link"  role="tab"  aria-controls="profile" aria-selected="false">
                                            
                                         <div>
                                        <form action="/showHistoryData" method="post">
                                            <input type="hidden" class="form-control ou btn2" placeholder="Requesting Days" name="empId" value="${empIdp}"/>
                                             <input type="submit" class="form-control ou btn2" value="Leave History"/>
                                        </form>
                                    </div>
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        </a>
                                    </li>

                                </ul>-->
                                
<!--                                Generating Area-->
                                



                                <div>
                                    <div>

                                        <section>
                                            <div class="container-fluid">
                                                <div class="container mt-5">
                                                    
                                                    
             
                                                      <fieldset class="border p-2">
                              <legend> <h4>Attendance</h4></legend>
            
<!--                                    <a href="/forDateTime">click here</a>-->
            
            
            
            
            
            
            
            
            
 <form action="/saveAttendanceData" method="post">  
<!--            
            <div class="row">
           <div class="col">
               <label>From Date</label>
               

               <hr/>
            <input type="date" class="form-control" placeholder="From Date" name="fromDate"/>
            </div>
            <div class="col">
                <label>To Date</label>
               <hr/>
                <input type="date" class="form-control" placeholder="To Date" name="toDate"/>
           </div>
           </div>-->
     
<!--     hidden Field-->

<div class="d-flex justify-content-center"><h1>Today:</h1> &nbsp;<h1 style="color: #06f318">${day}</h1></div>

     
<br/>

<div class="d-flex justify-content-center"><h2>Date:</h2> &nbsp;<h2 style="color:#0b1372">${submissionDate}</h2></div>

<br/>
<div class="d-flex justify-content-center"><h2>Your IP Address:</h2> &nbsp;<h2 style="color:#5b0569">${ip}</h2></div>
<h2></h2>
<br/>
<!--<h2>${submissionTime}</h2>
<br/>-->



<!--newField-->
<input type="hidden" name="id" value="${id}"/>


     <br/>

<!--new-->





   <input type="hidden" name="day" value="${day}"/>


     <br/>


    <input type="hidden" name="ip" value="${ip}"/>


     <br/>

     <input type="hidden" name="submissionDate" value="${submissionDate}"/>


     <br/>
     <input type="hidden" class="form-control"  name="empId" value="${empIdp}"/>
     
     
     <br/>
     <input type="hidden" class="form-control"  name="statusSend"  value="Present"/>
     
<!--       <br/>
       <input type="hidden" class="form-control" placeholder="Requesting Days" name="empName" value="${empName}"/>
       
       <br/>
       <input type="hidden" class="form-control" placeholder="Requesting Days" name="empDep" value="${empDep}"/>
       <br/>
       <input type="hidden" class="form-control" placeholder="Requesting Days" name="empDeg" value="${empDeg}"/>-->
     
     
         
<br/>
<!--     hidden Field-->
<!-- <div class="col">
                <label>Requesting Days</label>
               <hr/>
                <input type="text" class="form-control" placeholder="Requesting Days" name="reqDays">
           </div>-->
         
        <br/>
        
        
<!--        <label>Leave Type:</label>
        <hr/>
         <div class="form-group">
                         <select class="form-control" name="levType">

                               <option value="Annual Leave">Annual Leave</option>
                              <option value="Festival Leave">Festival Leave</option>
                              <option value="Miscellaneous">Miscellaneous</option>
                                                                     

                                </select>

          </div>-->
        
        
        
<!--        <br/>
        
        <label for="comment">Leave Reason In Detail:</label>
        <textarea class="form-control" rows="5" id="comment" name="levReason"> </textarea>
        
        
        <br/>-->


        
<!--         <button type="button" class="btn btn-success btn-lg btn-block">Submit</button>-->
   <input type="submit"  class="btn btn-success btn-lg btn-block" value="Post Attendance"/>
        
         </form>
            
            
            
            
            
        
        
       </fieldset>
                                                     

                                                    
                                                    
                                                    
                                                    
                                                   
         
                                                </div>
                                            </div>
                                        </section>

                                    </div>
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">

                                        <div class="container-fluid">
                                            <h3 class="text-dark mb-4">Team</h3>
                                            <div class="card shadow">
                                                <div class="card-header py-3">
                                                    <p class="text-primary m-0 font-weight-bold">Leave History</p>
                                                </div>
                                                
                                                                                                    <table class="table">
                                                        <thead>
                                                            <tr>
                                                                <th scope="col">Serial No.</th>
                                                                <th scope="col">Leave Type</th>
                                                                <th scope="col">From</th>
                                                                <th scope="col">To</th>

                                                                <th scope="col">Days</th>
                                                                <th scope="col">Approved Days</th>
                                                                <th scope="col">Status</th>
                                                                
                                                                
                                                               



                                                            </tr>
                                                        </thead>

                                                    </table>
                                                

                                                
                                                
                                                
                                            </div>
                                        </div>
                                    </div>

                                </div>




<!--Section-->
                                
                                
                                
                                
                                

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
