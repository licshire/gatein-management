/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.gatein.management.api.operation;

import org.gatein.management.api.ContentType;
import org.gatein.management.api.ExternalContext;
import org.gatein.management.api.ManagedResource;
import org.gatein.management.api.ManagedUser;
import org.gatein.management.api.PathAddress;
import org.gatein.management.api.RuntimeContext;
import org.gatein.management.api.binding.BindingProvider;
import org.gatein.management.api.model.Model;
import org.gatein.management.api.model.ModelValue;

import java.util.Locale;

/**
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
 * @version $Revision$
 */
public class OperationContextDelegate implements OperationContext
{
   private OperationContext delegate;

   public OperationContextDelegate(OperationContext delegate)
   {
      this.delegate = delegate;
   }

   @Override
   public ManagedUser getUser()
   {
      return delegate.getUser();
   }

   @Override
   public PathAddress getAddress()
   {
      return delegate.getAddress();
   }

   @Override
   public String getOperationName()
   {
      return delegate.getOperationName();
   }

   @Override
   public ManagedResource getManagedResource()
   {
      return delegate.getManagedResource();
   }

   @Override
   public RuntimeContext getRuntimeContext()
   {
      return delegate.getRuntimeContext();
   }

   @Override
   public ExternalContext getExternalContext()
   {
      return delegate.getExternalContext();
   }

   @Override
   public Model newModel()
   {
      return delegate.newModel();
   }

   @Override
   public <T extends ModelValue> T newModel(Class<T> modelType)
   {
      return delegate.newModel(modelType);
   }

   @Override
   public OperationAttributes getAttributes()
   {
      return delegate.getAttributes();
   }

   @Override
   public Locale getLocale()
   {
      return delegate.getLocale();
   }

   @Override
   public OperationAttachment getAttachment(boolean remove)
   {
      return delegate.getAttachment(remove);
   }

   @Override
   public BindingProvider getBindingProvider()
   {
      return delegate.getBindingProvider();
   }

   @Override
   public ContentType getContentType()
   {
      return delegate.getContentType();
   }
}
