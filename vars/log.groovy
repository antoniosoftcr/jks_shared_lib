def call() {
    echo "test mesasge"
}

def info(msg) {
    echo "test ${msg}"
}

def warning(map params = [:]) {
    echo "test mesasge: ${params.msg} for ${params.name}"
}