/*
 * Copyright 2016 John Grosh (jagrosh)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jagrosh.jdautilities.doc.standard;

import java.lang.annotation.*;

/**
 * The {@link java.lang.annotation.Repeatable @Repeatable} value
 * for {@link com.jagrosh.jdautilities.doc.standard.Error @Error}.
 * <br>Useful for organizing multiple @Error annotations
 *
 * @see    com.jagrosh.jdautilities.doc.standard.Error
 *
 * @since  2.0
 * @author Kaidan Gustave
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Errors
{
    /**
     * One or more {@link com.jagrosh.jdautilities.doc.standard.Error @Error}
     * annotations.
     *
     * @return One or more @Error annotations
     */
    Error[] value();
}
