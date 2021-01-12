import './App.css';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import SventeListContainer from './containers/SventeListContainer';
import NavigationComponent from './components/NavigationComponent';
import FormContainer from './containers/FormContainer';

function App() {
 
    return (
  
      <div className="container">
        
        <BrowserRouter>
          <NavigationComponent>
            <Switch>
              <Route exact path="/Elbromistafalso-spring"><SventeListContainer/></Route>
              <Route path="/newSvente"><FormContainer/></Route>
            </Switch>
          </NavigationComponent>
        </BrowserRouter>
        
      </div>
  
    );
  }

export default App;
