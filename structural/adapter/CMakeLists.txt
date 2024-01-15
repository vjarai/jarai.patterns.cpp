# CMakeList.txt : CMake project for ChainOfResponsibility, include source and define
# project specific logic here.
#

# Add source to this project's executable.
add_executable (
Adapter 
"Application.cpp" 
 "_ReadMe.md")

if (CMAKE_VERSION VERSION_GREATER 3.12)
  set_property(TARGET ChainOfResponsibility PROPERTY CXX_STANDARD 20)
endif()

# TODO: Add tests and install targets if needed.
