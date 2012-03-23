/*
 * Copyright (C) VSPLF Software Foundation (VSF), the origin author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vsplf.i18n.helpers;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Unit test for {@link MessageFormat}.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Mar 23, 2012
 */
public class MessageFormatTest {

  @Test
  public void checkSimpleFormat() {
    MessageFormat messageFormat = new MessageFormat();
    messageFormat.applyPattern("Hello {0}");
    String formatted = messageFormat.format(new String[]{"VSPLF"});
    assertThat("messageFormat must not be null", messageFormat, notNullValue());
    assertThat("formatted must be: Hello VSPLF", formatted, equalTo("Hello VSPLF"));
  }

}
