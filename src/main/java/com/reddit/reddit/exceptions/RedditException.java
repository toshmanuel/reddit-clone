package com.reddit.reddit.exceptions;

public class RedditException extends RuntimeException{
    public RedditException() {
    }

    public RedditException(String message) {
        super(message);
    }

    public RedditException(String message, Throwable cause) {
        super(message, cause);
    }

    public RedditException(Throwable cause) {
        super(cause);
    }
}
