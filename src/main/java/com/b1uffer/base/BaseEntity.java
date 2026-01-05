package com.b1uffer.base;

import java.time.Instant;
import java.util.UUID;

public class BaseEntity {
    protected UUID id;
    protected Instant createdAt;
    protected Instant updatedAt;
}
