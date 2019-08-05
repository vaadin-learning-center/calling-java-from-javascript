window.greet = function greet(name, element) {
    console.log("Hi, " + name);
    element.$server.greet("server");
}
