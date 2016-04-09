/*
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
package com.facebook.presto.hive.parquet;

import static java.lang.String.format;

public final class ParquetValidationUtils
{
    private ParquetValidationUtils()
    {
    }

    public static void validateParquet(boolean condition, String formatString, Object... args)
            throws ParquetCorruptionException
    {
        if (!condition) {
            throw new ParquetCorruptionException(format(formatString, args));
        }
    }
}
