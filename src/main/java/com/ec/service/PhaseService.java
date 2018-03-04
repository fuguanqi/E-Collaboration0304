package com.ec.service;

public interface PhaseService {
    int createPhase(Integer studentId, Integer projectId, String phTitle, String phDescription);
    int deletePhaseById(Integer phaseId, Integer leaderId);
}
