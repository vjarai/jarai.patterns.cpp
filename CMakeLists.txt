# CMakeList.txt : Top-level CMake project file, do global configuration
# and include sub-projects here.
#
cmake_minimum_required (VERSION 3.8)

project ("jarai.patterns.cpp")

# Include sub-projects.
add_subdirectory ("behavioral\\ChainOfResponsibility")
add_subdirectory ("behavioral\\state\\pattern")

add_subdirectory ("structural\\adapter")
add_subdirectory ("structural\\composite")
