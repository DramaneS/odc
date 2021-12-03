package com.example.backend.service;

import java.util.List;

import com.example.backend.model.Activite;
import com.example.backend.model.LogActivites;
import com.example.backend.model.Participation;

public interface LogActivitesService {
	 void addLogActivites(LogActivites act);
     void deleteLogActivitesByid(Long id_LogActivites);
     List<LogActivites> listLogActivites();
     LogActivites  listLogActivitebyid(Long id_LogActivites);
     List<LogActivites>responsByActivite(Long IdActivite);

}
