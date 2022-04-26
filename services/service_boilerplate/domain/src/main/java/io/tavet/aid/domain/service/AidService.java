package io.tavet.aid.domain.service;

import java.util.UUID;

import io.tavet.aid.domain.Aid;

public interface AidService {
    UUID createAidRequest(Aid aid);

    Aid getAidRequest(UUID id);
}
