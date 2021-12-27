
import { handleNovoItem } from "../components/cria-Tarefa.js";
import { carregaTarefa } from "../components/carrega-Tarefa.js";
const novaTarefa = document.querySelector("[data-form-button]");

novaTarefa.addEventListener("click", handleNovoItem);

carregaTarefa();
