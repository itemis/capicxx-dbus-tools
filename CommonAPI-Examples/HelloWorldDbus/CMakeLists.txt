cmake_minimum_required(VERSION 2.8)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -pthread -std=c++0x")
include_directories(
    src-gen
    $ENV{RUNTIME_PATH}/capicxx-core-runtime/include
    $ENV{RUNTIME_PATH}/capicxx-dbus-runtime/include
    $ENV{DBUS_PATH}
    /usr/local/lib/dbus-1.0/include
)
link_directories(
    $ENV{RUNTIME_PATH}/capicxx-core-runtime/build
    $ENV{RUNTIME_PATH}/capicxx-dbus-runtime/build
    $ENV{DBUS_PATH}/dbus/.libs
    /usr/local/lib/dbus-1.0/include
)
add_executable(HelloWorldClient
	src/HelloWorldClient.cpp
	src/HelloWorldStubImpl.cpp
	src-gen/v1/commonapi/HelloWorldDBusProxy.cpp
	src-gen/v1/commonapi/HelloWorldDBusDeployment
	src-gen/v1/commonapi/HelloWorldStubDefault
)
target_link_libraries(HelloWorldClient CommonAPI CommonAPI-DBus dbus-1)
add_executable(HelloWorldService
	src/HelloWorldService.cpp
	src/HelloWorldStubImpl.cpp
	src-gen/v1/commonapi/HelloWorldDBusStubAdapter.cpp
	src-gen/v1/commonapi/HelloWorldStubDefault
	src-gen/v1/commonapi/HelloWorldDBusDeployment
)
target_link_libraries(HelloWorldService CommonAPI CommonAPI-DBus dbus-1)
