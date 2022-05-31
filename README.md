## Spring DeferredResult Example

DeferredResult, available from Spring 3.2 onwards, assists in offloading a long-running computation from an http-worker thread to a separate thread.

Although the other thread will take some resources for computation, the worker threads are not blocked in the meantime and can handle incoming client requests.

The async request processing model is very useful as it helps scale an application well during high loads, especially for IO intensive operations.

# xb-demo
