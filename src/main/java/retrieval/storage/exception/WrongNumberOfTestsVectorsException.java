/*
 * Copyright 2015 ROLLUS Loïc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrieval.storage.exception;
import retrieval.exception.CBIRException;

/**
 * Number of tests vectors (T) from central server and server are different
 * @author Rollus Loic
 */
public class WrongNumberOfTestsVectorsException extends CBIRException {

    /**
     * Error Code
     */ 
    public static final String CODE = "1202";

    /**
     * Creates a new instance of <code>AlreadyInPuctureIndexException</code> without detail message.
     */
    public WrongNumberOfTestsVectorsException() {
        super(CODE,"");
    }


    /**
     * Constructs an instance of <code>AlreadyInPuctureIndexException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public WrongNumberOfTestsVectorsException(String msg) {
        super(CODE,msg);
    }
}
