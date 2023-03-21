package com.example.gallery.buckets;

public enum BucketName {

    PROFILE_IMAGE("gallery-luka77");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}