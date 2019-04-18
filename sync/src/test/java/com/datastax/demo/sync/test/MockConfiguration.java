/*
 * Copyright DataStax, Inc.
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
package com.datastax.demo.sync.test;

import com.datastax.demo.sync.repository.StockRepository;
import com.datastax.dse.driver.api.core.DseSession;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("unit-test")
@Configuration
public class MockConfiguration {

  @Bean
  @Primary
  public StockRepository mockStockRepository() {
    return Mockito.mock(StockRepository.class);
  }

  @Bean
  @Primary
  public DseSession session() {
    return Mockito.mock(DseSession.class);
  }
}
