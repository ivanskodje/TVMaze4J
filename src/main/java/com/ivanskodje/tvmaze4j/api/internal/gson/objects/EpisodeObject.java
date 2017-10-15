/*************************************************************************
 * This file (EpisodeObject.java) is part of TVMaze4J.                   *
 *                                                                       *
 * Copyright (c) 2017 Ivan Skodje.                                       *
 *                                                                       *
 * TVMaze4J is free software: you can redistribute it and/or modify      *
 * it under the terms of the GNU General Public License as published by  *
 * the Free Software Foundation, either version 3 of the License, or     *
 * (at your option) any later version.                                   *
 *                                                                       *
 * TVMaze4J is distributed in the hope that it will be useful,           *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 * GNU General Public License for more details.                          *
 *                                                                       *
 * You should have received a copy of the GNU General Public License     *
 * along with TVMaze4J.  If not, see <http://www.gnu.org/licenses/>.     *
 *************************************************************************/

package com.ivanskodje.tvmaze4j.api.internal.gson.objects;

import com.ivanskodje.tvmaze4j.api.internal.TVMazeError;
import com.sun.istack.internal.NotNull;
import lombok.Getter;

import java.util.Date;

/**
 * This represents a json Episode object.'
 * Will return defined "default values" on the missing received data.
 *
 * @author Ivan Skodje on 20/09/2017
 */
public class EpisodeObject
{
	private Integer id;
	private String url;
	private String name;
	private Integer season;
	private Integer number;
	private Date airdate;
	private String airtime;
	private Date airstamp;
	private Integer runtime;
	private @Getter ImageObject image;
	private String summary;
	private @Getter ShowObject show; // Received from schedule requests.
	private @Getter LinksObject _links;

	// TODO: Handle potential error statuses and messages differently.
	private Integer status; // Used for error handling
	private String message; // Error message

	public int getId()
	{
		return TVMazeError.getInteger(id);
	}

	public String getUrl()
	{
		return TVMazeError.getString(url);
	}

	public String getName()
	{
		return TVMazeError.getString(name);
	}

	public int getSeason()
	{
		return TVMazeError.getInteger(season);
	}

	public int getNumber()
	{
		return TVMazeError.getInteger(number);
	}

	public Date getAirdate()
	{
		return airdate;
	}

	public String getAirtime()
	{
		return TVMazeError.getString(airtime);
	}

	public Date getAirstamp()
	{
		return airstamp;
	}

	public int getRuntime()
	{
		return TVMazeError.getInteger(runtime);
	}

	public String getSummary()
	{
		return TVMazeError.getString(summary);
	}


	public Integer getStatus()
	{
		return TVMazeError.getInteger(status);
	}

	public String getMessage()
	{
		return TVMazeError.getString(message);
	}
}
