/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.sjka.logstash.osgi;

import java.util.Map;

import org.osgi.service.log.LogEntry;

/**
 * Extender to attach additional key-value-pairs to a log message.
 * 
 * @author Simon Kaufmann - Initial contribution and API.
 *
 */
public interface ILogstashPropertyExtension {

    public Map<String, String> getExtensions(LogEntry logEntry);

}
