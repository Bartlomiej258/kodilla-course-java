package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

public class BookSignature {

    private final String signature;

    public BookSignature(final String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return signature;
    }
}
