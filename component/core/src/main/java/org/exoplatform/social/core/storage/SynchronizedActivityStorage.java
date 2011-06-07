/*
 * Copyright (C) 2003-2011 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.exoplatform.social.core.storage;

import org.exoplatform.social.core.activity.model.ExoSocialActivity;
import org.exoplatform.social.core.identity.model.Identity;

import java.util.List;

/**
 * @author <a href="mailto:alain.defrance@exoplatform.com">Alain Defrance</a>
 * @version $Revision$
 */
public class SynchronizedActivityStorage extends ActivityStorage {
  @Override
  public ExoSocialActivity getActivity(final String activityId) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      return super.getActivity(activityId);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public List<ExoSocialActivity> getActivities(final Identity owner) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      return super.getActivities(owner);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public List<ExoSocialActivity> getActivities(final Identity owner, final long offset, final long limit) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      return super.getActivities(owner, offset, limit);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public void saveComment(final ExoSocialActivity activity, final ExoSocialActivity comment) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      super.saveComment(activity, comment);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public ExoSocialActivity saveActivity(final Identity owner, final ExoSocialActivity activity) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      return super.saveActivity(owner, activity);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public void deleteActivity(final String activityId) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      super.deleteActivity(activityId);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public void deleteComment(final String activityId, final String commentId) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      super.deleteComment(activityId, commentId);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public List<ExoSocialActivity> getActivitiesOfConnections(final List<Identity> connectionList, final long offset, final long limit) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      return super.getActivitiesOfConnections(connectionList, offset, limit);
    }
    finally {
      stopSynchronization(created);
    }

  }

  @Override
  public int getActivitiesCount(final Identity owner) throws ActivityStorageException {

    boolean created = startSynchronization();
    try {
      return super.getActivitiesCount(owner);
    }
    finally {
      stopSynchronization(created);
    }

  }
}
